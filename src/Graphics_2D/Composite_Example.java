package Graphics_2D;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 


import java.lang.Integer;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.*;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;





/* 
 * This applet renders an ellipse overlapping a rectangle with the compositing rule and 
 * alpha value selected by the user.
*/
 @SuppressWarnings("serial")
class Composite_Example extends JApplet implements ItemListener {
    private CompPanel comp;
    private JLabel alphaLabel;
    private JLabel rulesLabel;
    private JComboBox alphas;
    private JComboBox rules;
    private String alpha = "1.0";
    private int rule = 0;

    // Initializes the layout of the components.
    @SuppressWarnings("unchecked")
    public void init() {
        GridBagLayout layOut = new GridBagLayout();
        getContentPane().setLayout(layOut);

        GridBagConstraints l = new GridBagConstraints();
        l.weightx = 1.0;
        l.fill = GridBagConstraints.BOTH;
        l.gridwidth = GridBagConstraints.RELATIVE;
        setAlphaLabel(new JLabel());
        getAlphaLabel().setText("Alphas");
        Font newFont = getFont().deriveFont(1);
        getAlphaLabel().setFont(newFont);
        getAlphaLabel().setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(getAlphaLabel(), l);
        getContentPane().add(getAlphaLabel());   
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(layOut);

        l.gridwidth = GridBagConstraints.REMAINDER;
        setRulesLabel(new JLabel());
        getRulesLabel().setText("Rules");
        newFont = getFont().deriveFont(1);
        getRulesLabel().setFont(newFont);
        getRulesLabel().setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(getRulesLabel(), l);
        getContentPane().add(getRulesLabel());   

        GridBagConstraints a = new GridBagConstraints();
        a.gridwidth = GridBagConstraints.RELATIVE;
        a.weightx = 1.0;
        a.fill = GridBagConstraints.BOTH;
        setAlphas(new JComboBox());
        layOut.setConstraints(getAlphas(), a);
        getAlphas().addItem("1.0");
        getAlphas().addItem("0.75");
        getAlphas().addItem("0.50");
        getAlphas().addItem("0.25");
        getAlphas().addItem("0.0");
        getAlphas().addItemListener(this);
        getContentPane().add(getAlphas());

        a.gridwidth = GridBagConstraints.REMAINDER;
        setRules(new JComboBox());
        layOut.setConstraints(getRules(), a);
        getRules().addItem("SRC");
        getRules().addItem("DST_IN");
        getRules().addItem("DST_OUT");
        getRules().addItem("DST_OVER");
        getRules().addItem("SRC_IN");
        getRules().addItem("SRC_OVER");
        getRules().addItem("SRC_OUT");
        getRules().addItem("CLEAR");
        getRules().addItemListener(this);
        getContentPane().add(getRules());

        GridBagConstraints fC = new GridBagConstraints(); 
        fC.fill = GridBagConstraints.BOTH;
        fC.weightx = 1.0;
        fC.weighty = 1.0;
        fC.gridwidth = GridBagConstraints.REMAINDER;
        setComp(new CompPanel());
        layOut.setConstraints(getComp(), fC);
        getContentPane().add(getComp()); 

        validate();
    }

/*
 * Detects a change in either of the Choice components.  Resets the variable corresponding
 * to the Choice whose state is changed.  Invokes changeRule in CompPanel with the current
 * alpha and composite rules.
*/
    public void itemStateChanged(ItemEvent e){
        if ( e.getStateChange() != ItemEvent.SELECTED ) {
            return;
        }

        Object choice = e.getSource();
        if ( choice == getAlphas() ) {
            setAlpha((String) getAlphas().getSelectedItem());
        } else {
            setRule(getRules().getSelectedIndex());
        }
        getComp().changeRule(getAlpha(), getRule());
    }

    public static void main(String s[]) {
        JFrame f = new JFrame("Composite");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JApplet applet = new Composite_Example();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(300,300));
        f.setVisible(true);
    }

    /**
     * @return the comp
     */
    public CompPanel getComp() {
        return comp;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(CompPanel comp) {
        this.comp = comp;
    }

    /**
     * @return the alphaLabel
     */
    public JLabel getAlphaLabel() {
        return alphaLabel;
    }

    /**
     * @param alphaLabel the alphaLabel to set
     */
    public void setAlphaLabel(JLabel alphaLabel) {
        this.alphaLabel = alphaLabel;
    }

    /**
     * @return the rulesLabel
     */
    public JLabel getRulesLabel() {
        return rulesLabel;
    }

    /**
     * @param rulesLabel the rulesLabel to set
     */
    public void setRulesLabel(JLabel rulesLabel) {
        this.rulesLabel = rulesLabel;
    }

    /**
     * @return the alphas
     */
    public JComboBox getAlphas() {
        return alphas;
    }

    /**
     * @param alphas the alphas to set
     */
    public void setAlphas(JComboBox alphas) {
        this.alphas = alphas;
    }

    /**
     * @return the rules
     */
    public JComboBox getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(JComboBox rules) {
        this.rules = rules;
    }

    /**
     * @return the alpha
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    /**
     * @return the rule
     */
    public int getRule() {
        return rule;
    }

    /**
     * @param rule the rule to set
     */
    public void setRule(int rule) {
        this.rule = rule;
    }
}
class CompPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC);  
    private float alpha = 1.0f;

    public CompPanel(){}

// Resets the alpha and composite rules with selected items.	
    public void changeRule(String a, int rule) {
        setAlpha(Float.valueOf(a).floatValue());
        setAc(AlphaComposite.getInstance(getRule(rule), getAlpha()));
        repaint();
    }

// Gets the requested compositing rule.
    public int getRule(int rule){
        int alphaComp = 0;
        switch ( rule ) {
        case 0: alphaComp = AlphaComposite.SRC; break;
        case 1: alphaComp = AlphaComposite.DST_IN; break;
        case 2: alphaComp = AlphaComposite.DST_OUT; break;
        case 3: alphaComp = AlphaComposite.DST_OVER; break;
        case 4: alphaComp = AlphaComposite.SRC_IN; break;
        case 5: alphaComp = AlphaComposite.SRC_OVER; break;
        case 6: alphaComp = AlphaComposite.SRC_OUT; break;
        case 7: alphaComp = AlphaComposite.CLEAR; break;
        }
        return alphaComp;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;

        Dimension d = getSize();
        int w = d.width;
        int h = d.height; 

        // Creates the buffered image.
        BufferedImage buffImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gbi = buffImg.createGraphics();

        // Clears the previously drawn image.
        g2.setColor(Color.white);
        g2.fillRect(0, 0, d.width, d.height);

        int rectx = w/4;
        int recty = h/4;

        // Draws the rectangle and ellipse into the buffered image.
        gbi.setColor(new Color(0.0f, 0.0f, 1.0f, 1.0f));
        gbi.fill(new Rectangle2D.Double(rectx, recty, 150, 100));
        gbi.setColor(new Color(1.0f, 0.0f, 0.0f, 1.0f));    
        gbi.setComposite(getAc());
        gbi.fill(new Ellipse2D.Double(rectx+rectx/2,recty+recty/2,150,100));

        // Draws the buffered image.
        g2.drawImage(buffImg, null, 0, 0);
    }

    /**
     * @return the alpha
     */
    public float getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    /**
     * @return the ac
     */
    public AlphaComposite getAc() {
        return ac;
    }

    /**
     * @param ac the ac to set
     */
    public void setAc(AlphaComposite ac) {
        this.ac = ac;
    }
}   