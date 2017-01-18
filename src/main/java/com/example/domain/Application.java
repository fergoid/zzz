package com.example.domain;

/**
 * Created by a261004 on 18/01/2017.
 */

import lombok.Data;

import java.util.List;

@Data
public class Application {
    private String _id;
    private String _type;
    private String deploymentDisposition;
    private String retirementDate;
    private String architectureModel;
    private Person ITOwner;
    private String name;
    private Organisation owningOrganization;
    private String externalID;
    private List<SoftwareProductVersion> dplydSftwrePrdctVrsns;
    private Person businessOwner;
    private String startDate;
}
