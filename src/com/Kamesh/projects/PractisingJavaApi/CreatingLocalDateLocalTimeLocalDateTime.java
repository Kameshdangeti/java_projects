package com.Kamesh.projects.PractisingJavaApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreatingLocalDateLocalTimeLocalDateTime {
	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);

		System.out.println("It is :" + nowDateTime);

		LocalDateTime nowDateTime2 = LocalDateTime.now();

		System.out.println("It is :" + nowDateTime2);

		LocalDate preperationDay1 = LocalDate.of(2023, 10, 02);
		LocalDate preperationDay2 = LocalDate.parse("2023-10-02");

		System.out.println("Preparation day :" + preperationDay1);
		System.out.println("Preparation day :" + preperationDay2);

		LocalTime classBegins = LocalTime.of(9, 0);
		LocalTime classEnds = LocalTime.parse("11:00");

		System.out.println("class Begins at:" + classBegins + "and ends at :" + classEnds);
	}
}
