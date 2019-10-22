package org.apache.fineract.cn.deposit.api.v1.definition;

import feign.Response;
import org.apache.fineract.cn.api.client.FineractException;

public class ProductInstanceValidationException extends FineractException {
    public ProductInstanceValidationException(Response response) {
        super(response);
    }
}
