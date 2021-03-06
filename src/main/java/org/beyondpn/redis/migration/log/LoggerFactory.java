/*
 * Copyright 2015 BeyondPN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.beyondpn.redis.migration.log;

/**
 * A factory to create redis-migration loggers.
 * <p>
 * Created by yangjianhua on 2015/4/22.
 */
public class LoggerFactory {

    /**
     * get a logger instance
     *
     * @param clazz logger class
     * @return logger
     */
    public static Logger getLogger(Class<?> clazz) {
        return new ConsoleLogger();
    }

}