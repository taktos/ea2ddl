/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.extension.jdbc.gen.command;

import org.seasar.extension.jdbc.gen.exception.CommandFailedRuntimeException;

/**
 * 繧ｳ繝槭Φ繝峨ｒ陦ｨ縺吶う繝ｳ繧ｿ繝輔ぉ繝ｼ繧ｹ縺ｧ縺吶�
 * 
 * @author taedium
 */
public interface Command {

    /**
     * 螳溯｡後＠縺ｾ縺吶�
     * 
     * @throws CommandFailedRuntimeException
     *             繧ｳ繝槭Φ繝峨�螳溯｡後↓螟ｱ謨励＠縺溷�蜷�
     */
    void execute() throws CommandFailedRuntimeException;

}
