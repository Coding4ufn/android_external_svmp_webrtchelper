/*
 * Copyright 2013 The MITRE Corporation, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this work except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mitre.svmp.webrtc;

import org.mitre.svmp.protocol.SVMPProtocol.Response;
import org.mitre.svmp.protocol.SVMPProtocol.WebRTCMessage;
import org.mitre.svmp.protocol.SVMPProtocol.Response.ResponseType;

public class Translator {
    
    public static String ProtobufToJSON(WebRTCMessage pb) {
        return pb.getJson();
    }
    
    public static Response JSONToProtobuf(String json) {
        return Response.newBuilder()
                .setType(ResponseType.WEBRTC)
                .setWebrtcMsg(WebRTCMessage.newBuilder().setJson(json))
                .build();
    }

    private Translator() {};
}
