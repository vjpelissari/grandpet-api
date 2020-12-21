package br.com.grandpet.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import br.com.grandpet.domain.model.Cozinha;
import lombok.Data;
import lombok.NonNull;

// Classe vai "Empacotar" uma lista de cozinhas
// Usada para nomear os nos no retorno em XML (Accept: application/xml)

@JacksonXmlRootElement(localName = "cozinhas")
@Data
public class CozinhasXmlWrapper {

	// @NonNull: 
	// informando que essa propriedade é obrigatório, para ser gerado o construtor para cozinha
	// caso a propriedade não fosse obrigatoria, o contrutor nao seria gerado.
	@JsonProperty("cozinha")
	@JacksonXmlElementWrapper(useWrapping = false)
	@NonNull
	private List<Cozinha> cozinhas;
}
