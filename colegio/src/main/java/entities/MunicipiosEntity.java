package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "municipios")
public class MunicipiosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_municipio")
	private int idMunicipio;
	@Column(name = "id_provincia")
	private int idProvincia;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cod_municipio")
	private String codMunicipio;
	@Column(name = "DC")
	private String dc;
	@OneToMany(mappedBy = "municipio")
	private List<AlumnoEntity> alumnos = new ArrayList<>();

	public MunicipiosEntity() {
	}
//Constructor, setter, getters...
}
