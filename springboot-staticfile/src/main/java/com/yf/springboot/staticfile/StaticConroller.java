package com.yf.springboot.staticfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-12 23:37
 **/
@Controller
public class StaticConroller {

    public static final String ROOT = "d:\\";

    private final ResourceLoader resourceLoader;

    @Autowired
    public StaticConroller(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

   /* @RequestMapping(method = RequestMethod.GET, value = "/")
    public String provideUploadInfo(Model model) throws IOException {
        model.addAttribute("files", Files.walk(Paths.get(ROOT)).filter(path->!path
                .equals(Paths.get(ROOT)))
                .map(path->Paths.get(ROOT)
                .relativize(path))
                .map(path->linkTo(methodOn(StaticConroller.class)
                .getFile(path.toString()))
                 .withRel(path.toString()))
                .collect(Collectors.toList()));
        return "uploadForm";
    }*/
    //方法二：通过请求定位
    @RequestMapping(method = RequestMethod.GET, value = "/res/{filename:.+}")
    @ResponseBody
    public ResponseEntity<?> getFile(@PathVariable String filename) {
        //不带下层路径可以直接访问
        //带下层路径的资源需要filename进行urlencode作为请求参数，然后解析后获取
        String path = Paths.get(ROOT, filename).toString();
        try {
            return ResponseEntity.ok(resourceLoader.getResource("file:" + path));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
