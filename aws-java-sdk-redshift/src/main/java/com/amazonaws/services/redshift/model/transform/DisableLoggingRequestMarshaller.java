/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Disable Logging Request Marshaller
 */
public class DisableLoggingRequestMarshaller implements Marshaller<Request<DisableLoggingRequest>, DisableLoggingRequest> {

    public Request<DisableLoggingRequest> marshall(DisableLoggingRequest disableLoggingRequest) {

        if (disableLoggingRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableLoggingRequest> request = new DefaultRequest<DisableLoggingRequest>(disableLoggingRequest, "AmazonRedshift");
        request.addParameter("Action", "DisableLogging");
        request.addParameter("Version", "2012-12-01");

        if (disableLoggingRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(disableLoggingRequest.getClusterIdentifier()));
        }

        return request;
    }
}
