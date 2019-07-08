package com.bnpp.galaxy.entities;

public class PartnershipLockedException extends Exception {

    public PartnershipLockedException(String message) {
        super(message);
    }

    public static PartnershipLockedException forPartnership(Partnership p) {
        return forNameAndLock(p.getName(), p.getExecutionLock());
    }

    public static PartnershipLockedException forNameAndLock(String name, String executionLock) {
        return new PartnershipLockedException(String.format("Unable to lock partnership '%s': already locked by '%s'", name, executionLock));
    }

}
