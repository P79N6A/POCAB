package com.bnpp.galaxy.controller;

import com.bnpp.galaxy.entities.PartnershipLockedException;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partnership")
public class PartnershipResource {

    private final PartnershipService partnershipService;

    public PartnershipResource(PartnershipService partnershipService) {
        this.partnershipService = partnershipService;
    }

    @GetMapping("/{name}/state")
    public PartnershipStateDTO getState(@PathVariable String name) {
        return new PartnershipStateDTO(
                partnershipService.isLocked(name),
                partnershipService.isHold(name)
        );
    }

    @RequestMapping(path = "/{name}/hold", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
    public PartnershipStateDTO setHold(@PathVariable String name, @RequestBody boolean hold) {
        partnershipService.hold(name, hold);

        return getState(name);
    }

    @RequestMapping(path = "/{name}/lock", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
    public PartnershipStateDTO setLock(@PathVariable String name, @RequestBody boolean lock) throws PartnershipLockedException {
        partnershipService.lock(name, lock);

        return getState(name);
    }

    @RequiredArgsConstructor
    @Getter
    private static class PartnershipStateDTO {
        private final boolean locked;
        private final boolean hold;

    }

}
