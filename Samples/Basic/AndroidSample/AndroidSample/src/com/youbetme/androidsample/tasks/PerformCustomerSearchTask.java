package com.youbetme.androidsample.tasks;

import com.youbetme.androidsample.proxies.Proxy;

public class PerformCustomerSearchTask extends SuperTask {
	
	public PerformCustomerSearchTask(String token){
		super(token);
	}
	
    protected String[] doInBackground(String...request) {
    	 int count = request.length;
         String[] response = new String[count];
         Proxy proxy = new Proxy();
         for (int i = 0; i < count; i++) {
        	response[i] = proxy.PerformCustomerSearch(this.token, request[i]);
         }
         return response;
    }

    protected void onProgressUpdate(Integer... progress) {
      
    }

    protected void onPostExecute(String result) {
        
    }
}
