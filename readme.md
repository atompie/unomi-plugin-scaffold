<!--
  ~ Licensed to the Apache Software Foundation (ASF) under one or more
  ~ contributor license agreements.  See the NOTICE file distributed with
  ~ this work for additional information regarding copyright ownership.
  ~ The ASF licenses this file to You under the Apache License, Version 2.0
  ~ (the "License"); you may not use this file except in compliance with
  ~ the License.  You may obtain a copy of the License at
  ~
  ~      http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License
  -->

feature:repo-add mvn:org.apache.unomi/unomi-plugins-uql-karaf-kar/1.5.4/unomi-plugins-uql-karaf-kar-1.5.4-features.xml
feature:repo-add mvn:unomi-plugins-uql/unomi-plugins-uql-karaf-kar/1.5.4/xml/features

feature:repo-add file:/plugins/unomi-plugins-uql-karaf-kar/1.5.4/xml/features


Error executing command: Error executing command on bundles:
Error starting bundle 13: Unable to resolve unomi-plugins-uql-core [13](R 13.0): missing requirement [unomi-plugins-uql-core [13](R 13.0)] osgi.wiring.package; (osgi.wiring.package=org.apache.unomi.plugins.uql.actions) Unresolved requirements: [[unomi-plugins-uql-core [13](R 13.0)] osgi.wiring.package; (osgi.wiring.package=org.apache.unomi.plugins.uql.actions)]
