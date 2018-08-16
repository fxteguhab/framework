package com.odoo.addons.product.providers;

import com.odoo.base.addons.res.ProductTemplate;
import com.odoo.core.orm.provider.BaseModelProvider;

public class ProductsSyncProvider extends BaseModelProvider {
    public static final String TAG = ProductsSyncProvider.class.getSimpleName();

    @Override
    public String authority() {
        return ProductTemplate.AUTHORITY;
    }
}