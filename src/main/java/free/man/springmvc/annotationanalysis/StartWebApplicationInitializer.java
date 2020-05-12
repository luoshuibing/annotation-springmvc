package free.man.springmvc.annotationanalysis;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StartWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }

    /**
     * 将DispatcherServlet映射到"/"
     */
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
