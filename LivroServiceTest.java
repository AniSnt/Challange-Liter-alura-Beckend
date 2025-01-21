import com.exemplo.model.Livro;
import com.exemplo.repository.LivroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class LivroServiceTest {

    private LivroService livroService;

    @Mock
    private LivroRepository livroRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        livroService = new LivroService(livroRepository);
    }

    @Test
    void testSalvarLivro() {
        Livro livro = new Livro();
        livro.setTitulo("Livro de Teste");
        livro.setAutor("Autor de Teste");

        when(livroRepository.save(livro)).thenReturn(livro);

        Livro livroSalvo = livroService.salvar(livro);

        verify(livroRepository, times(1)).save(livro);
        assertEquals(livro, livroSalvo);
    }
}
