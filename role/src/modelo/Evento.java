package modelo;

import java.awt.Color;
import java.awt.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Evento {
	private UUID id;
	
	private String emoji;
	private Color color;
	private String nome;
	private String local;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	
	private ArrayList<Insumo> insumos = new ArrayList<>();
	private ArrayList<Usuario> usuarios = new ArrayList<>();

	public Evento(String emoji, Color color, String nome, String local, LocalDateTime dataInicio, LocalDateTime dataFim) {
		super();
		this.id = UUID.randomUUID();
		this.emoji = emoji;
		this.color = color;
		this.nome = nome;
		this.setLocal(local);
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getEmoji() {
		return emoji;
	}
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDateTime getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}
	public ArrayList<Insumo> getInsumos() {
		return insumos;
	}
	public void setInsumos(ArrayList<Insumo> insumos) {
		this.insumos = insumos;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String descricaoSimples() {
		String data = null;
		
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("pt", "BR"));
		try {
			data = df2.format(df1.parse("2023-11-20 20:43:20"));
		} catch (ParseException e) {
			data = "sem data definida";
			e.printStackTrace();
		}
		
		return data + " • " + String.valueOf(usuarios.size()) + " participantes";
	}
}
