package com.hackathon.upakriti.models;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class LikeCompositeKey implements Serializable {
	private String userid;
	private String qrid;
	
	public LikeCompositeKey() {}
	
	public LikeCompositeKey(String userid,String qrid) {
		this.userid=userid;
		this.qrid=qrid;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( o == null || getClass() != o.getClass() ) {
			return false;
		}
		LikeCompositeKey pk = (LikeCompositeKey) o;
		return Objects.equals( userid, pk.userid ) &&
				Objects.equals( qrid, pk.qrid );
	}

	@Override
	public int hashCode() {
		return Objects.hash( userid, qrid );
	}
	
}
