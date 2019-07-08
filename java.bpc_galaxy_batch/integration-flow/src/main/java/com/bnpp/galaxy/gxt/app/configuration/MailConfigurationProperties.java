package com.bnpp.galaxy.gxt.app.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Optional;

@ConfigurationProperties("gxt.mail")
public class MailConfigurationProperties {
	private From from = new From();
	private Reporting reporting = new Reporting();

	public From getFrom() {
		if (from == null) {
			from = new From();
		}

		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public Reporting getReporting() {
		return reporting;
	}

	public void setReporting(Reporting reporting) {
		this.reporting = reporting;
	}

	public static class From {
		private String address;
		private String name;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Optional<String> getName() {
			return Optional.ofNullable(name);
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class Reporting {
		private String recipient;

		public String getRecipient() {
			return recipient;
		}

		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
	}
}
