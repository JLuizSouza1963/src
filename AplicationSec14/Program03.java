package AplicationSec14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import EntitiesSec14.Reservation;

public class Program03 {
	
	public static void main(String[] args) throws ParseException {
		/*Very bad solution*/
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nro.do quarto : ");
		int number = sc.nextInt();
		System.out.println("Data do check-in : ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Data do check-out : ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("CheckOut deve ser posterior ao Checkin");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("");
			System.out.println("Entre com a data da atualização da reserva");
			System.out.println("Data do check-in : ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Data do check-out : ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva para atualização as datas devem ser futuras");
			}
			else if (!checkOut.after(checkIn)) {
				System.out.println("CheckOut deve ser posterior ao Checkin");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
			
	}
}
