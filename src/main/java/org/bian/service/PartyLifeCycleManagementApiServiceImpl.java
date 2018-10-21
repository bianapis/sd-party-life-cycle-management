/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyLifeCycleManagementApiServiceImpl implements PartyLifeCycleManagementApiService {

	public PartyLifeCycleWithIDAndRoot executePost(PartyLifeCycleBasic request){
		return JsonReader.read("executePost-PartyLifeCycleWithIDAndRoot.json",new TypeReference<PartyLifeCycleWithIDAndRoot>(){});
	}
	
	public PartyLifeCycleWithIDAndRoot executePut(String crReferenceId, PartyLifeCycleBasic request){
		return JsonReader.read("executePut-PartyLifeCycleWithIDAndRoot.json",new TypeReference<PartyLifeCycleWithIDAndRoot>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public PartyLifeCycleWithIDAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-PartyLifeCycleWithIDAndRoot.json",new TypeReference<PartyLifeCycleWithIDAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public Reporting retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-Reporting.json",new TypeReference<Reporting>(){});
	}
	
	public PartyLifeCycleWithIDAndRoot update(String crReferenceId, PartyLifeCycleBasic request){
		return JsonReader.read("update-PartyLifeCycleWithIDAndRoot.json",new TypeReference<PartyLifeCycleWithIDAndRoot>(){});
	}
	
}
