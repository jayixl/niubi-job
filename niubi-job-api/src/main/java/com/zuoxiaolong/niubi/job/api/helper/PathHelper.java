/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.niubi.job.api.helper;

/**
 * @author Xiaolong Zuo
 * @since 16/1/19 00:43
 */
public abstract class PathHelper {

    public static String getParentPath(String path) {
        return path.substring(0, path.lastIndexOf("/"));
    }

    public static String getJobPath(String jobParentPath, String group , String name) {
        return jobParentPath + "/" + group + "." + name;
    }

}