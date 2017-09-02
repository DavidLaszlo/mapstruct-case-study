package com.github.davidl.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.github.davidl.enums.MyEnum;

public class TypeConversionExampleDTO {

	// implicit type conversions
	private int i;
	private Integer i1;

	private long l;
	private Long l1;

	private double d;
	private Double d1;

	private float f;
	private Float f1;

	private boolean b;
	private Boolean b1;

	private String bool;
	private Boolean bool1;

	private String myEnumS;
	private MyEnum myEnum;

	private BigInteger biginteger;
	private BigDecimal bigDecimal;

	private BigInteger bigintegerFromString;
	private BigDecimal bigDecimalFromString;

	private String bigintegerToS;
	private String bigDecimalToS;

	// Can't map property "java.lang.String xmlElement" to "javax.xml.bind.JAXBElement<java.lang.String> xmlElement".
	// Consider to declare/implement a mapping method:
	// "javax.xml.bind.JAXBElement<java.lang.String> map(java.lang.String value)".
	// private JAXBElement<String> xmlElement;
	private String xmlElementS;

	private XMLGregorianCalendar fromCalendar;
	private XMLGregorianCalendar fromDate;

	private Date dateFromXml;
	private Calendar calendarFromXml;

	private Date dateFromString;
	private XMLGregorianCalendar xmlCalendarFromString;

	private String stringFromDate;
	private String stringFromXmlCalendar;

	// @formatter:off
	// TODO other mappings to implement
	//	Between Jodas org.joda.time.DateTime, org.joda.time.LocalDateTime, org.joda.time.LocalDate, org.joda.time.LocalTime and String. A format string as understood by java.text.SimpleDateFormat can be specified via the dateFormat option (see above).
	//	Between Jodas org.joda.time.DateTime and javax.xml.datatype.XMLGregorianCalendar, java.util.Calendar.
	//	Between Jodas org.joda.time.LocalDateTime, org.joda.time.LocalDate and javax.xml.datatype.XMLGregorianCalendar, java.util.Date.
	//	Between java.time.ZonedDateTime, java.time.LocalDateTime, java.time.LocalDate, java.time.LocalTime from Java 8 Date-Time package and String. A format string as understood by java.text.SimpleDateFormat can be specified via the dateFormat option (see above).
	//	Between java.time.ZonedDateTime from Java 8 Date-Time package and java.util.Date where, when mapping a ZonedDateTime from a given Date, the system default timezone is used.
	//	Between java.time.LocalDateTime from Java 8 Date-Time package and java.util.Date where timezone UTC is used as the timezone.
	//	Between java.time.LocalDate from Java 8 Date-Time package and java.util.Date where timezone UTC is used as the timezone.
	//	Between java.time.ZonedDateTime from Java 8 Date-Time package and java.util.Calendar.
	//	Between java.sql.Time and java.util.Date
	//	Between java.sql.Timestamp and java.util.Date
	// @formatter:on

	public int getI() {
		return i;
	}

	public void setI(final int i) {
		this.i = i;
	}

	public Integer getI1() {
		return i1;
	}

	public void setI1(final Integer i1) {
		this.i1 = i1;
	}

	public long getL() {
		return l;
	}

	public void setL(final long l) {
		this.l = l;
	}

	public Long getL1() {
		return l1;
	}

	public void setL1(final Long l1) {
		this.l1 = l1;
	}

	public double getD() {
		return d;
	}

	public void setD(final double d) {
		this.d = d;
	}

	public Double getD1() {
		return d1;
	}

	public void setD1(final Double d1) {
		this.d1 = d1;
	}

	public float getF() {
		return f;
	}

	public void setF(final float f) {
		this.f = f;
	}

	public Float getF1() {
		return f1;
	}

	public void setF1(final Float f1) {
		this.f1 = f1;
	}

	public boolean isB() {
		return b;
	}

	public void setB(final boolean b) {
		this.b = b;
	}

	public Boolean getB1() {
		return b1;
	}

	public void setB1(final Boolean b1) {
		this.b1 = b1;
	}

	public String getBool() {
		return bool;
	}

	public void setBool(final String bool) {
		this.bool = bool;
	}

	public Boolean getBool1() {
		return bool1;
	}

	public void setBool1(final Boolean bool1) {
		this.bool1 = bool1;
	}

	public String getMyEnumS() {
		return myEnumS;
	}

	public void setMyEnumS(final String myEnumS) {
		this.myEnumS = myEnumS;
	}

	public MyEnum getMyEnum() {
		return myEnum;
	}

	public void setMyEnum(final MyEnum myEnum) {
		this.myEnum = myEnum;
	}

	public BigInteger getBiginteger() {
		return biginteger;
	}

	public void setBiginteger(final BigInteger biginteger) {
		this.biginteger = biginteger;
	}

	public BigDecimal getBigDecimal() {
		return bigDecimal;
	}

	public void setBigDecimal(final BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	public BigInteger getBigintegerFromString() {
		return bigintegerFromString;
	}

	public void setBigintegerFromString(final BigInteger bigintegerFromString) {
		this.bigintegerFromString = bigintegerFromString;
	}

	public BigDecimal getBigDecimalFromString() {
		return bigDecimalFromString;
	}

	public void setBigDecimalFromString(final BigDecimal bigDecimalFromString) {
		this.bigDecimalFromString = bigDecimalFromString;
	}

	public String getBigintegerToS() {
		return bigintegerToS;
	}

	public void setBigintegerToS(final String bigintegerToS) {
		this.bigintegerToS = bigintegerToS;
	}

	public String getBigDecimalToS() {
		return bigDecimalToS;
	}

	public void setBigDecimalToS(final String bigDecimalToS) {
		this.bigDecimalToS = bigDecimalToS;
	}

	public String getXmlElementS() {
		return xmlElementS;
	}

	public void setXmlElementS(final String xmlElementS) {
		this.xmlElementS = xmlElementS;
	}

	public XMLGregorianCalendar getFromCalendar() {
		return fromCalendar;
	}

	public void setFromCalendar(final XMLGregorianCalendar fromCalendar) {
		this.fromCalendar = fromCalendar;
	}

	public XMLGregorianCalendar getFromDate() {
		return fromDate;
	}

	public void setFromDate(final XMLGregorianCalendar fromDate) {
		this.fromDate = fromDate;
	}

	public Date getDateFromXml() {
		return dateFromXml;
	}

	public void setDateFromXml(final Date dateFromXml) {
		this.dateFromXml = dateFromXml;
	}

	public Calendar getCalendarFromXml() {
		return calendarFromXml;
	}

	public void setCalendarFromXml(final Calendar calendarFromXml) {
		this.calendarFromXml = calendarFromXml;
	}

	public Date getDateFromString() {
		return dateFromString;
	}

	public void setDateFromString(final Date dateFromString) {
		this.dateFromString = dateFromString;
	}

	public XMLGregorianCalendar getXmlCalendarFromString() {
		return xmlCalendarFromString;
	}

	public void setXmlCalendarFromString(final XMLGregorianCalendar xmlCalendarFromString) {
		this.xmlCalendarFromString = xmlCalendarFromString;
	}

	public String getStringFromDate() {
		return stringFromDate;
	}

	public void setStringFromDate(final String stringFromDate) {
		this.stringFromDate = stringFromDate;
	}

	public String getStringFromXmlCalendar() {
		return stringFromXmlCalendar;
	}

	public void setStringFromXmlCalendar(final String stringFromXmlCalendar) {
		this.stringFromXmlCalendar = stringFromXmlCalendar;
	}

}
