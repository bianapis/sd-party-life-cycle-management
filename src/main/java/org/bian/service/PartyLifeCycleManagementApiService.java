/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyLifeCycleManagementApiService {

	PartyLifeCycleWithIDAndRoot executePost(PartyLifeCycleBasic request);
	
	PartyLifeCycleWithIDAndRoot executePut(String crReferenceId, PartyLifeCycleBasic request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	PartyLifeCycleWithIDAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	Reporting retrieveReportings(String crReferenceId, String bqReferenceId);
	
	PartyLifeCycleWithIDAndRoot update(String crReferenceId, PartyLifeCycleBasic request);
	
}
