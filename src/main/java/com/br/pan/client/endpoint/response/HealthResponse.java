package com.br.pan.client.endpoint.response;

public class HealthResponse {

    private String status = "OK";

    public String getStatus() {
        return status;
    }

	@Override
	public String toString() {
		return "HealthResponse [" + (status != null ? "status=" + status : "") + "]";
	}
    
    

}
