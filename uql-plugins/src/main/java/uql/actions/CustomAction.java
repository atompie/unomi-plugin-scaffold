/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uql.actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.unomi.api.Event;
import org.apache.unomi.api.Profile;
import org.apache.unomi.api.actions.Action;
import org.apache.unomi.api.actions.ActionExecutor;
import org.apache.unomi.api.services.EventService;
import org.apache.unomi.persistence.spi.CustomObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAction implements ActionExecutor {
    private static final Logger logger = LoggerFactory.getLogger(CustomAction.class.getName());

    private static String getParamValue(Action action, String key, String defaultValue) {
        Object property = action.getParameterValues().get(key);
        return (property == null)
                ? defaultValue
                : (String) action.getParameterValues().get(key);
    }

    private static int getParamIntegerValue(Action action, String key, int defaultValue) {
        Object property = action.getParameterValues().get(key);
        return (property == null)
                ? defaultValue
                : (int) action.getParameterValues().get(key);
    }

    @Override
    public int execute(Action action, Event event) {
        logger.debug("Started CustomAction");

        String param1 = getParamValue(action, "param1", "default");
        int param2 = getParamIntegerValue(action, "param2", 100);

        logger.info("CustomAction got param1: " + param1);
        logger.info("CustomAction got param2: " + param2);
        Profile profile = event.getProfile();
        try {
            String param3 = CustomObjectMapper.getObjectMapper().writeValueAsString(profile);
            logger.info("CustomAction got param2: " + param3);
        } catch (JsonProcessingException e) {
            logger.error("CustomAction could not serialize profile to JSON");
        }

        return EventService.NO_CHANGE;
    }
}


