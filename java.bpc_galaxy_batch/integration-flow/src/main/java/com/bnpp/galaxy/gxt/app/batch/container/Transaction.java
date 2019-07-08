package com.bnpp.galaxy.gxt.app.batch.container;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "transaction")
public class Transaction implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 6522181251090072904L;

	public Transaction() {
		super();
	}

	private String id;
	private Instrument instrument;

	private List<Date> date;
	private Quanity quanity;
	private List<Party> party;

	/**
	 * @return the instrument
	 */
	public Instrument getInstrument() {
		return instrument;
	}

	/**
	 * @param instrument
	 *            the instrument to set
	 */
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	/**
	 * @return the quanity
	 */
	public Quanity getQuanity() {
		return quanity;
	}

	/**
	 * @param quanity
	 *            the quanity to set
	 */
	public void setQuanity(Quanity quanity) {
		this.quanity = quanity;
	}

	/**
	 * @return the date
	 */
	public List<Date> getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(List<Date> date) {
		this.date = date;
	}

	/**
	 * @return the party
	 */
	public List<Party> getParty() {
		return party;
	}

	/**
	 * @param party
	 *            the party to set
	 */
	public void setParty(List<Party> party) {
		this.party = party;
	}

	/**
	 * @return the id
	 */
	@XmlAttribute
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [id=");
		builder.append(id);
		builder.append(", instrument=");
		builder.append(instrument);
		builder.append(", date=");
		builder.append(date);
		builder.append(", quanity=");
		builder.append(quanity);
		builder.append(", party=");
		builder.append(party);
		builder.append("]");
		return builder.toString();
	}

}
