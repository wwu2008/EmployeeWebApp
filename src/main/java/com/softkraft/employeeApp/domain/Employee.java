package com.softkraft.employeeApp.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
@SuppressWarnings(value="serial")

public class Employee implements Serializable, Comparable<Employee>
{
    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long employeeId;
	
	@Override
	public int compareTo(Employee employee)
	{
		// TODO Auto-generated method stub
		return Long.valueOf(employeeId).compareTo(Long.valueOf(employee.employeeId));
	}

	@Column (name="fisrt_name")
	private String firstName;
	
	@Column (name="last_name")
    private String lastName;
	
	@Column
    private String address;
	
	@Column (name="phone")
    private String phoneNumber;
    
	
	public Employee() {}
	
	public Employee(long employeeId, String firstName, String lastName,
			String address, String phoneNumber)
	{
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public long getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(long employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastname()
	{
		return lastName;
	}

	public void setLastname(String lastname)
	{
		this.lastName = lastname;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", surname=" + firstName
				+ ", lastname=" + lastName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null)
		{
			if (other.address != null)
				return false;
		}
		else if (!address.equals(other.address))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null)
		{
			if (other.firstName != null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null)
		{
			if (other.lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null)
		{
			if (other.phoneNumber != null)
				return false;
		}
		else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
		
}
