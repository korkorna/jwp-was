package webserver.http;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestBodyTest {

    @ParameterizedTest
    @CsvSource(value = {"userId:javajigi", "password:password", "name:JaeSung"}, delimiter = ':')
    void parse(String input, String expected) {
        RequestBody requestBody = RequestBody.parse("userId=javajigi&password=password&name=JaeSung");
        assertThat(requestBody.getParameter(input)).isEqualTo(expected);
    }
}
