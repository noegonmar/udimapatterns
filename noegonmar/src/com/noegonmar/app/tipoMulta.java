package com.noegonmar.app;

import java.io.Serializable;

public enum tipoMulta implements Serializable{

	MGSP,
	MGCP,
	MMGCP;
	
	public String toString(){
        switch(this){
        case MGSP :
            return "MGSP";
        case MGCP :
            return "MGCP";
        case MMGCP :
            return "MMGCP";
        }
        return null;
    }
}
