
package com.projeto.vraptor4.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author israeljl
 */
@Controller
public class IndexController {
    
    @Inject private Result result;
    
    @Path("/")
    public void index() {
        result.include("mensagem", "VRaptor 4 funcionou!");
    }
}
