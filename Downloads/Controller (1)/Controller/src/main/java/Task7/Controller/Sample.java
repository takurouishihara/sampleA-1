package Task7.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public  class Sample {
    @GetMapping("/names")
    public List<String> getNames() {
        return List.of("koyama", "tanaka");
    }


    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        // 登録処理は省略

        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id") // id部分は実際に登録された際に発⾏したidを設定する
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }
    @PatchMapping("/names")
    public ResponseEntity<Map<String, String>> update(@RequestBody CreateForm form) {
        // 更新処理は省略
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }
    @DeleteMapping("/names")
    public ResponseEntity<Map<String, String>> delete(@RequestBody  CreateForm form) {
        //
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id") // id部分は実際に削除された際に発⾏したidを設定する
                .build()
                .toUri();
        return ResponseEntity.ok(Map.of("message", "name successfully delete"));
    }
}
