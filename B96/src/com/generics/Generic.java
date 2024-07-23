package com.generics;

public class Generic<T> {
	T data,obj;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Generic [data=" + data + ", obj=" + obj + "]";
	}

	

}
