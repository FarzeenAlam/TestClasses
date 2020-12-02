package com.SafeRide;

import java.util.List;

public class ScheduleTrip 
{

	private String SearchMedicaidId;
	private String FirstName;
	private String LastName;
	private String PreviousTrips;
	private String TripLegsUsed;
	private String Remaining;
	private String TransportMode;
	private String CallDate;
	private String TripIdToSearch;
	
	public class MemberInformation{
		
		 private String PhoneNo;
		 private String MCE;
		 private String Address;
		 private String DOB;
		 private String Eligibility;
		 private String GroupId;
		 private String ProdLine;
		 private String Restriction;
	}
	
	public class TripInformation{
		
		private String TripDate;
		private String TripType;
		private String AdminTrip;
		private String OpenDoor;
		private String TripId;
		private String SpecialRequest;
	}
	
	public class PickUpLocation{
		
		private String LegNo;
		private String LegType;
		private List<String> RecentOriginLocations;
		private String OriginAddress1;
		private String OriginAddress2;
		private String OriginCity;
		private String OriginState;
		private String OriginZip;
		private String OriginPhoneNo;
	}
	
	public class DropOffLocation{
		
		private String Appointment;
		private String ToBeReady;
		private List<String> RecentDropOffLocations;
		private String DestinationAddress1;
		private String DestinationAddress2;
		private String DestinationCity;
		private String DestinationState;
		private String DestinationZip;
		private String DestinationPhoneNo;
	}
	
	public class TripTerritory{
		
		private String Territory;
	}
	
	public class EscortAndCoRiders{
		
		private String EscortName;
		private String EscortRelation;
		private List<String> CoRider;
		private String Comments;
	}
	
	public class TripNotes{
		
		private String ChildHasCarSeats;
		private String MemberRequireMedEscort;
		private String NoOfExtraRiders;
		private String PickUpTimeForLongDist;
		private String SpokeTo;
		private String LeftMessageWith;
		private String LeftMessageOnVoiceMail;
	}
}
