package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PartyLifeCycleBasic
 */
public class PartyLifeCycleBasic   {
  private Object partyLifeCycleStatusRecord = null;

  private String customerReference = null;

  private String partyReference = null;

  private String partyRelationshipType = null;

  private String partyLifeCycleStatus = null;


  /**
   * `status: Provisionally Registered` bian-reference: PartyRelationship.LifecyclePhase general-info: \"Party Life-cycle Status Record (master record - details the party relationship standing)\" 
   * @return partyLifeCycleStatusRecord
  **/

  public Object getPartyLifeCycleStatusRecord() {
    return partyLifeCycleStatusRecord;
  }

  public void setPartyLifeCycleStatusRecord(Object partyLifeCycleStatusRecord) {
    this.partyLifeCycleStatusRecord = partyLifeCycleStatusRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRelationship.RoleInRelationship.Player(as Party) general-info: \"Refers to the individual/organization\" 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference: PartyRelationship.RoleInRelationship.Player(as Party).Identification.LEI iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) general-info: \"Refers to the associated legal entity\" 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRelationship.PartyRelationshipType general-info: \"Defines the nature of the bank association\" 
   * @return partyRelationshipType
  **/

  public String getPartyRelationshipType() {
    return partyRelationshipType;
  }

  public void setPartyRelationshipType(String partyRelationshipType) {
    this.partyRelationshipType = partyRelationshipType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRelationship.LifecyclePhase.Status general-info: \"Party Life-cycle Status (prospect, on-board, under review, in-resolution, inactive etc.)\" 
   * @return partyLifeCycleStatus
  **/

  public String getPartyLifeCycleStatus() {
    return partyLifeCycleStatus;
  }

  public void setPartyLifeCycleStatus(String partyLifeCycleStatus) {
    this.partyLifeCycleStatus = partyLifeCycleStatus;
  }


}

