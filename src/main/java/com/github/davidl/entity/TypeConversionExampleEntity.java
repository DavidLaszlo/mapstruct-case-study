package com.github.davidl.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import com.github.davidl.enums.MyEnum;

public class TypeConversionExampleEntity {
	// implicit type conversions
	private Integer i;
	private int i1;

	private Long l;
	private long l1;

	private Double d;
	private double d1;

	private Float f;
	private float f1;

	private Boolean b;
	private boolean b1;

	private Boolean bool;
	private String bool1;

	private MyEnum myEnumS;
	private String myEnum;

	private BigDecimal biginteger;
	private BigInteger bigDecimal;

	private String bigintegerFromString;
	private String bigDecimalFromString;

	private BigInteger bigintegerToS;
	private BigDecimal bigDecimalToS;

	// Can't map property "java.lang.String xmlElement" to "javax.xml.bind.JAXBElement<java.lang.String> xmlElement".
	// Consider to declare/implement a mapping method:
	// "javax.xml.bind.JAXBElement<java.lang.String> map(java.lang.String value)".
	// private String xmlElement;
	private JAXBElement<String> xmlElementS;

	private Calendar fromCalendar;
	private Date fromDate;

	private XMLGregorianCalendar dateFromXml;
	private XMLGregorianCalendar calendarFromXml;

	private String dateFromString;
	private String xmlCalendarFromString;

	private XMLGregorianCalendar stringFromDate;
	private XMLGregorianCalendar stringFromXmlCalendar;

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

	public Integer getI() {
		return i;
	}

	public void setI(final Integer i) {
		this.i = i;
	}

	public int getI1() {
		return i1;
	}

	public void setI1(final int i1) {
		this.i1 = i1;
	}

	public Long getL() {
		return l;
	}

	public void setL(final Long l) {
		this.l = l;
	}

	public long getL1() {
		return l1;
	}

	public void setL1(final long l1) {
		this.l1 = l1;
	}

	public Double getD() {
		return d;
	}

	public void setD(final Double d) {
		this.d = d;
	}

	public double getD1() {
		return d1;
	}

	public void setD1(final double d1) {
		this.d1 = d1;
	}

	public Float getF() {
		return f;
	}

	public void setF(final Float f) {
		this.f = f;
	}

	public float getF1() {
		return f1;
	}

	public void setF1(final float f1) {
		this.f1 = f1;
	}

	public Boolean getB() {
		return b;
	}

	public void setB(final Boolean b) {
		this.b = b;
	}

	public boolean isB1() {
		return b1;
	}

	public void setB1(final boolean b1) {
		this.b1 = b1;
	}

	public Boolean getBool() {
		return bool;
	}

	public void setBool(final Boolean bool) {
		this.bool = bool;
	}

	public String getBool1() {
		return bool1;
	}

	public void setBool1(final String bool1) {
		this.bool1 = bool1;
	}

	public MyEnum getMyEnumS() {
		return myEnumS;
	}

	public void setMyEnumS(final MyEnum myEnumS) {
		this.myEnumS = myEnumS;
	}

	public String getMyEnum() {
		return myEnum;
	}

	public void setMyEnum(final String myEnum) {
		this.myEnum = myEnum;
	}

	public BigDecimal getBiginteger() {
		return biginteger;
	}

	public void setBiginteger(final BigDecimal biginteger) {
		this.biginteger = biginteger;
	}

	public BigInteger getBigDecimal() {
		return bigDecimal;
	}

	public void setBigDecimal(final BigInteger bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	public String getBigintegerFromString() {
		return bigintegerFromString;
	}

	public void setBigintegerFromString(final String bigintegerFromString) {
		this.bigintegerFromString = bigintegerFromString;
	}

	public String getBigDecimalFromString() {
		return bigDecimalFromString;
	}

	public void setBigDecimalFromString(final String bigDecimalFromString) {
		this.bigDecimalFromString = bigDecimalFromString;
	}

	public BigInteger getBigintegerToS() {
		return bigintegerToS;
	}

	public void setBigintegerToS(final BigInteger bigintegerToS) {
		this.bigintegerToS = bigintegerToS;
	}

	public BigDecimal getBigDecimalToS() {
		return bigDecimalToS;
	}

	public void setBigDecimalToS(final BigDecimal bigDecimalToS) {
		this.bigDecimalToS = bigDecimalToS;
	}

	public JAXBElement<String> getXmlElementS() {
		return xmlElementS;
	}

	public void setXmlElementS(final JAXBElement<String> xmlElementS) {
		this.xmlElementS = xmlElementS;
	}

	public Calendar getFromCalendar() {
		return fromCalendar;
	}

	public void setFromCalendar(final Calendar fromCalendar) {
		this.fromCalendar = fromCalendar;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(final Date fromDate) {
		this.fromDate = fromDate;
	}

	public XMLGregorianCalendar getDateFromXml() {
		return dateFromXml;
	}

	public void setDateFromXml(final XMLGregorianCalendar dateFromXml) {
		this.dateFromXml = dateFromXml;
	}

	public XMLGregorianCalendar getCalendarFromXml() {
		return calendarFromXml;
	}

	public void setCalendarFromXml(final XMLGregorianCalendar calendarFromXml) {
		this.calendarFromXml = calendarFromXml;
	}

	public String getDateFromString() {
		return dateFromString;
	}

	public void setDateFromString(final String dateFromString) {
		this.dateFromString = dateFromString;
	}

	public String getXmlCalendarFromString() {
		return xmlCalendarFromString;
	}

	public void setXmlCalendarFromString(final String xmlCalendarFromString) {
		this.xmlCalendarFromString = xmlCalendarFromString;
	}

	public XMLGregorianCalendar getStringFromDate() {
		return stringFromDate;
	}

	public void setStringFromDate(final XMLGregorianCalendar stringFromDate) {
		this.stringFromDate = stringFromDate;
	}

	public XMLGregorianCalendar getStringFromXmlCalendar() {
		return stringFromXmlCalendar;
	}

	public void setStringFromXmlCalendar(final XMLGregorianCalendar stringFromXmlCalendar) {
		this.stringFromXmlCalendar = stringFromXmlCalendar;
	}

}
