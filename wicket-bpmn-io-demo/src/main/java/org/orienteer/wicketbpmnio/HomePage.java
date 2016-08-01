package org.orienteer.wicketbpmnio;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.template.PackageTextTemplate;
import org.apache.wicket.util.template.TextTemplate;
import org.orienteer.wicketbpmnio.component.BpmnModeler;
import org.orienteer.wicketbpmnio.component.BpmnViewer;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public static final String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<bpmn2:definitions xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" xmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\" xmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" xmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\" xsi:schemaLocation=\"http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd\" id=\"sample-diagram\" targetNamespace=\"http://bpmn.io/schema/bpmn\">"+
			"  <bpmn2:process id=\"Process_1\" isExecutable=\"false\"><bpmn2:startEvent id=\"StartEvent_1\"/></bpmn2:process>"+
			"  <bpmndi:BPMNDiagram id=\"BPMNDiagram_1\">"+
			"    <bpmndi:BPMNPlane id=\"BPMNPlane_1\" bpmnElement=\"Process_1\">"+
			"      <bpmndi:BPMNShape id=\"_BPMNShape_StartEvent_2\" bpmnElement=\"StartEvent_1\">"+
			"        <dc:Bounds height=\"36.0\" width=\"36.0\" x=\"412.0\" y=\"240.0\"/>"+
			"      </bpmndi:BPMNShape>"+
			"    </bpmndi:BPMNPlane>"+
			"  </bpmndi:BPMNDiagram>"+
			"</bpmn2:definitions>";

	public HomePage(final PageParameters parameters) {
		super(parameters);
		Form<String> form = new Form<String>("form");
		add(form);

		IModel<String> model = Model.of(XML);

		form.add(new BpmnModeler("bpmnModeler", model));
		form.add(new BpmnViewer("bpmnViewer", model));
    }
	
}
