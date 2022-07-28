package ko.alliex.energy.business.service;

import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractBaseService {

    @Value("${justsystem.synchronizedMode:true}")
    protected boolean synchronizedMode;

    @Value("${justsystem.token}")
    protected String justToken;

    @Value("${justsystem.url.company}")
    protected String JUST_SYSTEM_COMPANY_URL;

    @Value("${justsystem.kikanurl.company}")
    protected String KIKAN_COMPANY_URL_PREFIX;

    @Value("${justsystem.url.powplant}")
    protected String JUST_SYSTEM_POWPLANT_URL;

    @Value("${justsystem.kikanurl.powplant}")
    protected String KIKAN_POWPLANT_URL_PREFIX;

    @Value("${justsystem.urlimport}")
    protected String IMPORT_DIR;

}
