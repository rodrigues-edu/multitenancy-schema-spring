package br.com.exemplos.eduardo.multitenancyschemaspring.configuration.datasource;

import br.com.exemplos.eduardo.multitenancyschemaspring.configuration.web.ThreadTenantStorage;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class TenantRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadTenantStorage.getTenantId();
    }
}