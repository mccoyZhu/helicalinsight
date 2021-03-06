/**
 *    Copyright (C) 2013-2017 Helical IT Solutions (http://www.helicalinsight.com) - All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.helicalinsight.hwf.core.api;

/**
 * @author Somen
 */
public interface ProcessType {
    int NORMAL_PROCESS = 1;
    int CONDITIONAL_PROCESS_TRUE = 2;
    int CONDITIONAL_PROCESS_FALSE = 3;
    int ITERATIVE_PROCESS = 4;
    int FOUND_ITERATOR_IN_STACK = 5;
    int ITERATIVE_SUCCESS = 6;
    int ITERATIVE_EXCEPTION = 7;

}
