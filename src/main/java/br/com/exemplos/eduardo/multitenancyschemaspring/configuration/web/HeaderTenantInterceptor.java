package br.com.exemplos.eduardo.multitenancyschemaspring.configuration.web;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class HeaderTenantInterceptor implements WebRequestInterceptor {

    public static final String TENANT_HEADER = "X-tenant";

    @Override
    public void preHandle(WebRequest request) throws Exception {
        ThreadTenantStorage.setTenantId(request.getHeader(TENANT_HEADER));
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
        ThreadTenantStorage.clear();
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
