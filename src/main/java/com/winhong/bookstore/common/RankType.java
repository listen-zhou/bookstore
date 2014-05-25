/*
 * Created on 2014/5/23
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright @2014 the original author or authors.
 */
package com.winhong.bookstore.common;

/**
 * 排行榜类型
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/5/23
 */
public enum RankType {
    /**
     * BUY：销售
     * NEW：新书
     * CLICK：关注
     * COMMENT：评论
     * FAVORITE：收藏
     */
    BUY, NEW, CLICK, COMMENT, FAVORITE
}
