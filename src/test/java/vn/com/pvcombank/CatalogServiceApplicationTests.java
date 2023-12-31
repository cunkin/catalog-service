//package vn.com.pvcombank;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import vn.com.pvcombank.domain.Book;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class CatalogServiceApplicationTests {
//
//    @Autowired
//    private WebTestClient webTestClient;
//
//    @Test
//    void whenPostRequestThenBookCreated() {
//
//        Book book = Book.of("1234567890", "title", "author", 10.0, "publisher");
//        webTestClient.post()
//                .uri("/books")
//                .bodyValue(book)
//                .exchange()
//                .expectStatus().isCreated()
//                .expectBody(Book.class)
//                .value(actualBook -> {
//
//                    assertThat(actualBook).isNotNull();
//                    assertThat(actualBook.isbn()).isEqualTo(book.isbn());
//                });
//    }
//
//    @Test
//    void contextLoads() {
//    }
//
//}
