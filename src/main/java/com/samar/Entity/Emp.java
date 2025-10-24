package com.samar.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
  @Id
	private int eid;
	private String ename;
	private double esal;
	private String desg;
	private String cname;
	private double ta;
	private double da;
	private double pf;
	private double grass;
	private double net;
	public Emp() {
		super();
	}
	public Emp(int eid, String ename, double esal, String desg, String cname, double ta, double da, double pf,
			double grass, double net) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.desg = desg;
		this.cname = cname;
		this.ta = ta;
		this.da = da;
		this.pf = pf;
		this.grass = grass;
		this.net = net;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrass() {
		return grass;
	}
	public void setGrass(double grass) {
		this.grass = grass;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", desg=" + desg + ", cname=" + cname
				+ ", ta=" + ta + ", da=" + da + ", pf=" + pf + ", grass=" + grass + ", net=" + net + "]";
	}
	
	
}
