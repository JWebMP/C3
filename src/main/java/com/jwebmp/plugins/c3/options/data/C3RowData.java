package com.jwebmp.plugins.c3.options.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * An ArrayList of Specific Row Data.
 * Is an ArrayList of type Object
 *
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3RowData<D>
		extends ArrayList<D>
		implements Comparable<C3RowData>
{

	public static final Comparator<C3RowData> COMPARATOR = (o1, o2) -> {
		if (o1 != null && o2 != null)
		{
			if (o1.getType() == C3RowDataType.Header)
			{
				return -1;
			}
		}
		return 0;
	};


	private C3RowDataType type;

	public C3RowData()
	{
		//Nothing Needed
	}

	@Override
	public int compareTo(C3RowData o)
	{
		if (type == C3RowDataType.Header)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	/**
	 * Returns the type for the C3RowData
	 *
	 * @return
	 */
	public C3RowDataType getType()
	{
		return type;
	}

	/**
	 * Sets the type for the C3Row Data
	 *
	 * @param type
	 */
	public void setType(C3RowDataType type)
	{
		this.type = type;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof C3RowData))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		C3RowData<?> c3RowData = (C3RowData<?>) o;
		return getType() == c3RowData.getType();
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getType());
	}
}
