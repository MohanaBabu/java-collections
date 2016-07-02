package com.levo.h.mutable_map_keys;

import java.util.Objects;

public class MutableString {
	
	private String value;
	
	public MutableString(final String value) {
		set(value);
	}
	
	public String get() {
		return value;
	}
	
	public void set(final String value) {
		Objects.requireNonNull(value);
		this.value = value;
	}
	
	@Override
	public boolean equals(final Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		
		final MutableString that =(MutableString) o;
		
		return value.equals(that.value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value;
	}
	
}
