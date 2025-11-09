package com.agrocontrol.backend.iam.application.internal.outboundservices.acl;

/**
 * ExternalProfileService interface used to create external profiles for users.
 */
public interface ExternalProfileService {
    /**
     * Create an agricultural producer profile and return its id (or 0L on failure)
     */
    Long createAgriculturalProducer(String fullName, String city, String country, String phone, String dni, Long userId);

    /**
     * Create a distributor profile and return its id (or 0L on failure)
     */
    Long createDistributor(String fullName, String city, String country, String phone, String companyName, String ruc, Long userId);
}

