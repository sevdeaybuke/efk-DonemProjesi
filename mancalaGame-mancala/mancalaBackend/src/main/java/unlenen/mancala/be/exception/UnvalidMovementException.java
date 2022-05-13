/*
# Copyright © 2022 Nebi Volkan UNLENEN
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
 */
package unlenen.mancala.be.exception;

import unlenen.mancala.be.constant.Player;

/**
 *
 * @author Nebi Volkan UNLENEN(unlenen@gmail.com)
 */
public class UnvalidMovementException extends GameException {

    public UnvalidMovementException(Player player, int pitId, String message) {
        super("Move is not valid for player : " + player + " in pit : " + pitId + " due to '" + message + "'");
    }

}
