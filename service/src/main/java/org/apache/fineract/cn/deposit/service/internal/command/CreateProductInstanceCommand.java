/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.deposit.service.internal.command;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.fineract.cn.deposit.api.v1.instance.domain.ProductInstance;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CreateProductInstanceCommand {

  @JsonProperty("command")
  private ProductInstance productInstance;

  public CreateProductInstanceCommand(final ProductInstance productInstance) {
    super();
    this.productInstance = productInstance;
  }

  public CreateProductInstanceCommand() {
    super();
  }

  public ProductInstance getProductInstance() {
    return productInstance;
  }

  public void setProductInstance(ProductInstance productInstance) {
    this.productInstance = productInstance;
  }

  public ProductInstance productInstance() {
    return this.productInstance;
  }
}
