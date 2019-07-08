package com.bnpp.galaxy.gxt.app.utils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Collections;

import org.fpml._2005.fpml_4_2.ConversationId;
import org.fpml._2005.fpml_4_2.MessageHeader;
import org.fpml._2005.fpml_4_2.MessageId;
import org.fpml._2005.fpml_4_2.PartyId;

public class MessageHeaderBuilder {

    private String messageId = "001";
    private String sendBy = "BARCLAYS";
    private String sendTo = "SOPHIS";
    private String creationTimeStamp = "2005-09-19T13:52:00";

    public MessageHeaderBuilder messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public MessageHeaderBuilder sendBy(String sendBy) {
        this.sendBy = sendBy;
        return this;
    }

    public MessageHeaderBuilder sendTo(String sendTo) {
        this.sendTo = sendTo;
        return this;
    }

    public MessageHeaderBuilder creationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }

    public MessageHeader build() {

        ConversationId conversationId = new ConversationId();
        conversationId.setValue("");
        conversationId.setConversationIdScheme("");

        MessageId messageId = new MessageId();
        messageId.setValue(this.messageId);
        messageId.setMessageIdScheme("http://www.sophis.net/gxml/exchange/messageIdScheme/simple");

        PartyId sentBy = new PartyId();
        sentBy.setValue(this.sendBy);
        sentBy.setPartyIdScheme("http://www.sophis.net/party/partyId/name");

        PartyId sendTo = new PartyId();
        sendTo.setValue(this.sendTo);
        sendTo.setPartyIdScheme("http://www.sophis.net/party/partyId/name");
        XMLGregorianCalendar creationTimestamp;
        try {
            creationTimestamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(this.creationTimeStamp);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }

        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setConversationId(conversationId);
        messageHeader.setMessageId(messageId);
        messageHeader.setSentBy(sentBy);
        messageHeader.setSendTo(Collections.singletonList(sendTo));
        messageHeader.setCreationTimestamp(creationTimestamp);
        return messageHeader;
    }

}
