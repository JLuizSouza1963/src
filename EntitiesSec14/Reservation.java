package EntitiesSec14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
		if (!checkout.after(checkin)) {
			throw new DomainException("CheckOut deve ser posterior ao Checkin");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date chekout) throws DomainException {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Erro na reserva para atualização as datas devem ser futuras");
		}
		if (!checkout.after(checkin)) {
			throw new DomainException("CheckOut deve ser posterior ao Checkin");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Quarto "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkin)
				+ ", check-out: "
				+ sdf.format(checkout)
				+ ", " 
				+ duration()
				+ " noites";
	}
}
