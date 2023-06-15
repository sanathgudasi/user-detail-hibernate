package com.ripplestreet.userdetailshibernate.main;

import java.util.Date;
import java.util.Scanner;

import com.ripplestreet.userdetailshibernate.controller.PersonInfoController;
import com.ripplestreet.userdetailshibernate.dto.PersonInfo;


public class Main {

	public static void main(String[] args) {
		PersonInfoController controller = new PersonInfoController();
		
		Scanner sc = new Scanner(System.in);

		for(;;) {

			System.out.println("enter 1 to save person details");
			System.out.println("enter 2 to get person information");
			System.out.println("enter 3 to update person name");
			System.out.println("enter 4 to update person email");
			System.out.println("enter 5 to update person phone");
			System.out.println("enter 6 to update person dob");
			System.out.println("enter 7 to get all person details");
			System.out.println("enter 8 to delete person info");
			System.out.println("enter c to close");
			String key = sc.next();
			switch (key) {
			case "1" : {
				System.out.println("do you want to continue to save details? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter following details");
					System.out.println("enter name");
					String name = sc.next();
					System.out.println("enter email");
					String email = sc.next();
					System.out.println("enter phone number");
					long phone = sc.nextLong();
					System.out.println("enter dob");
					System.out.println("enter year of birth");
					int year = sc.nextInt();
					System.out.println("enter month of birth");
					int month = sc.nextInt();
					System.out.println("enter day of birth");
					int day = sc.nextInt();
					Date dob = new Date(year, month, day);
					PersonInfo info =new PersonInfo(name, email, phone, dob);
					controller.savePersonInfo(info);
					break;
				}
				else {
					break;

				}
			}

			case "2" : {
				System.out.println("do you want to get the person details? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter person id to get information");
					int personId = sc.nextInt();
					controller.getPersonInfo(personId);
					break;
				}
				else break;
			}

			case "3" : {
				System.out.println("do you want to update name? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter id to update name");
					int personId = sc.nextInt();
					System.out.println("enter new name");
					String newName = sc.next();
					controller.updatePersonName(personId, newName);
					break;
				}
				else break;
			}

			case "4" : {
				System.out.println("do you want to update email? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter id to update email");
					int personId = sc.nextInt();
					System.out.println("enter new email");
					String newEmail = sc.next();
					controller.updatePersonEmail(personId, newEmail);
					break;
				}
				else break;
			}

			case "5" : {
				System.out.println("do you want to update phone? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter id to update phone");
					int personId = sc.nextInt();
					System.out.println("enter new phone");
					long newPhone = sc.nextLong();
					controller.updatePersonPhone(personId, newPhone);
					break;
				}
				else break;
			}

			case "6" : {
				System.out.println("do you want to update DOB? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter id to update DOB");
					int personId = sc.nextInt();
					System.out.println("enter year of birth");
					int year = sc.nextInt();
					System.out.println("enter month of birth");
					int month = sc.nextInt();
					System.out.println("enter day of birth");
					int day = sc.nextInt();
					Date newDob = new Date(year, month, day);
					controller.updatePersonDob(personId, newDob);
					break;
				}
				else break;
			}

			case "7" : {
				System.out.println("do you want to get all details? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("get all person details");
					controller.getAllPersonInfo();
					break;
				}
				else break;
			}

			case "8" : {
				System.out.println("do you want to delete? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					System.out.println("enter person id to delete");
					int personId = sc.nextInt();
					controller.deletePersonInfo(personId);
					break;
				}
				else break;
			}
			
			case "c" : {
				System.out.println("do you want to close? y/n");
				String option  =sc.next();
				if(option.equalsIgnoreCase("y")) {
					sc.close();
					System.out.println("closed");
					return;
				}
				else break;
			}

			default:
				System.out.println("please enter valid option");
				break;
				
				
			}

		}
	}
}

