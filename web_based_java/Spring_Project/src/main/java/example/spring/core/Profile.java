package example.spring.core;

public class Profile {
private int candidateId;
private String name;
private EducationInfo educationdetails;
private ContactInfo contactdetails;
public Profile() {
	super();
	// TODO Auto-generated constructor stub
}
public Profile(int candidateId, String name, EducationInfo educationdetails, ContactInfo contactdetails) {
	super();
	this.candidateId = candidateId;
	this.name = name;
	this.educationdetails = educationdetails;
	this.contactdetails = contactdetails;
}
public int getCandidateId() {
	return candidateId;
}
public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public EducationInfo getEducationdetails() {
	return educationdetails;
}
public void setEducationdetails(EducationInfo educationdetails) {
	this.educationdetails = educationdetails;
}
public ContactInfo getContactdetails() {
	return contactdetails;
}
public void setContactdetails(ContactInfo contactdetails) {
	this.contactdetails = contactdetails;
}
@Override
public String toString() {
	return "Profile [candidateId=" + candidateId + ", name=" + name + ", educationdetails=" + educationdetails
			+ ", contactdetails=" + contactdetails + "]";
}




}
