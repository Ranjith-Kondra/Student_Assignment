package com.dto;


	public class Student {
		
		private int stdId;
		private String stdName;
		private String batch;
		private String gender;
		private String emailId;
		private String password;
		
		public Student() {
			super();
		}

		public Student(int stdId, String stdName, String batch, String gender, String emailId, String password) {
			super();
			this.stdId = stdId;
			this.stdName = stdName;
			this.batch= batch;
			this.gender = gender;
			this.emailId = emailId;
			this.password = password;
		}

		public int getstdId() {
			return stdId;
		}
		public void setstdId(int stdId) {
			this.stdId = stdId;
		}

		public String getstdName() {
			return stdName;
		}
		public void setstdName(String stdName) {
			this.stdName = stdName;
		}

		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}

		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Employee [stdId=" + stdId + ", stdName=" + stdName + ", Batch=" + batch + ", gender=" + gender
					+ ", emailId=" + emailId + ", password=" + password + "]";
		}
	}
